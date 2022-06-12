import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BaseService {
  API_SERVICE:string="https://gorest.co.in"
  header:HttpHeaders|any;
  constructor(private httpClient:HttpClient) {
    this.header=new HttpHeaders().set("Content-type","application/json");
   }

  get(path:string="",params:any={}){

    return new Promise((thanhcong,thatbai)=>{
      try {
        this.httpClient.get(this.API_SERVICE+path,{params,headers:this.header})
        .subscribe((res:any)=>{
          thanhcong(res);
        });
      } catch (error) {
          thatbai(error)
      }
    })
  }
}
