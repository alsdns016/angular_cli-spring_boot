import { Component } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
  result = null;

  constructor(private http: HttpClient){
  }

  private sayHello(): void {
    this.result = 'loading...';
    this.http.get(`/postLists`).subscribe(response => this.result = response.toString());
  }


}
