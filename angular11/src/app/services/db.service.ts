import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DbService {

  constructor() { }

  save(data:any,key:string){
    localStorage.setItem(key,JSON.stringify(data));
  }
  read(key:string){
  try {
    let strNote = localStorage.getItem(key);
    if(strNote)
    {
      return JSON.parse(strNote);
    }
  } catch (error) {
   alert('Du lieu khong hop le')
  }
  }
}
