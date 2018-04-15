import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButtonModule, MatToolbarModule } from '@angular/material';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';

@NgModule({
  imports: [MatButtonModule, MatTableModule, MatToolbarModule, MatPaginatorModule],
  exports: [MatButtonModule, MatTableModule, MatToolbarModule, MatPaginatorModule],
})
export class MaterialModule { }
