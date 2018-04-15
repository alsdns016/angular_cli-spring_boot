import { Component, OnInit } from '@angular/core';

import { MatTableDataSource } from '@angular/material';
import { MatPaginator } from '@angular/material';
import { ViewChild } from '@angular/core';

import { HttpClient } from "@angular/common/http";
import "rxjs/Rx";
import {Post} from "./post.model";


interface dbposts {
  id : number ,
  title : string,
  content : string,
  author : string,
  created_date : string,
  modified_date : string
}

@Component({
  selector: 'app-appmain',
  templateUrl: './appmain.component.html',
  styleUrls: ['./appmain.component.css']
})
export class AppmainComponent implements OnInit {

  posts:Post[];

  displayedColumns = ['title', 'content', 'author'];
  dataSource;

  @ViewChild(MatPaginator) paginator: MatPaginator;

  constructor(private http: HttpClient) {
    this.http.get<dbposts[]>('/postLists')
      .subscribe(res => {
        this.posts = res;
        this.dataSource = new MatTableDataSource<dbposts>(this.posts);
        this.dataSource.paginator = this.paginator;
      });
  }

/*
  getposts(){
    return this.http.get('/postLists')
      .map(
        (response: Response) => {
          return response.json();
        }
      );
  }*/

  ngOnInit() {
/*    this.getposts()
      .subscribe(
        (tasks: any[]) => {
          this.posts = tasks
        },
        (error) => console.log(error)
      );*/
/*
      this.posts1 = this.getposts();
      this.getposts().subscribe((data2) => {
        this.datas = data2;
        console.log(data2)
      });*/

  }

}
