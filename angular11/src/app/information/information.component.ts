import { Component, OnInit } from '@angular/core';
import { informations } from '../models/information.model';

@Component({
  selector: 'app-information',
  templateUrl: './information.component.html',
  styleUrls: ['./information.component.scss']
})
export class InformationComponent implements OnInit {


  constructor() { }
  thongtin:informations[]=[
    new informations('Le Tran Anh Tinh ',501200378,'Công nghệ thông tin',5)
  ];
  ngOnInit(): void {
  }

}
