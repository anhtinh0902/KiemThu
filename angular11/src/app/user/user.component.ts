import { Component, OnInit, Output,EventEmitter } from '@angular/core';
import { NgForm } from '@angular/forms';
import { user } from '../models/user.model';
import { DbService } from '../services/db.service';
import { LoggerService } from '../services/logger.service';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {
  list_user : user []|any = [];
  user:user = new user;
  showModal:boolean=false;
  constructor(private loggerService:LoggerService,private dbservice:DbService,private userService:UserService) {

   }

  ngOnInit(): void {
    this.list_user = this.dbservice.read("list_user")
    this.loggerService.info("Xin chao");
    this.loadData();
  }
  openModal(){
    this.showModal=true;
  }
  colseModal(){
    this.showModal=false;
  }
  onSubmit(form:NgForm){
    if(form.valid)
{
  let objCP= Object.assign({},this.user);
  this.list_user.push(objCP);
  this.user=new user;
  this.dbservice.save(this.list_user,"list_user")
  form.reset();
  // form.reset();

}
else{
  alert("Vui long hoan thanh form!!!")
}
}

delete(i:number){
  this.list_user.splice(i,1);
  this.dbservice.save(this.list_user,"list_user");
}
loadData(){
  this.userService.getAllUser().then(res=>{
    this.list_user=res

  }).catch((err)=>{
    console.log(err);
  })
}

}
