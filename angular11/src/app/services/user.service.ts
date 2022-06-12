import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BaseService } from './base.service';

@Injectable({
  providedIn: 'root'
})
export class UserService extends BaseService{

  constructor(httClient:HttpClient) {
    super(httClient);
   }
   getAllUser(){
    return this.get("/public/v2/users")
   }
}
