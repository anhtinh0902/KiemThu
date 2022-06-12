import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import { notes } from '../models/note.model';

@Component({
  selector: 'app-notes',
  templateUrl: './notes.component.html',
  styleUrls: ['./notes.component.scss']
})
export class NotesComponent implements OnInit {

  list_notes:notes[]=[];
  details:string='';
  note:notes = new notes();
  constructor() { }

  ngOnInit(): void {
    this.read();
  }
  detail(i:number){
      this.details=this.list_notes[i].content;
  }
  openEdit(note:notes){
    let copi = Object.assign({},note);
    this.note = copi;
  }
  saveNote(note:notes)
  {
    if(note.id > 0) {
      this.list_notes.forEach(element => {
        if(element.id == note.id) {
          element.content = note.content;
          element.status = note.status;
          element.name = note.name;
        }
        return;
      });
    }
    else {
      note.id = Date.now() / 1000 | 0;
      this.list_notes.push(note);
    }
    this.save();
  }
  save(){
    localStorage.setItem('list_notes',JSON.stringify(this.list_notes));
  }
  read(){
  try {
    let strNote = localStorage.getItem('list_notes');
    if(strNote)
    {
      this.list_notes= JSON.parse(strNote);
    }
  } catch (error) {
   alert('Du lieu khong hop le')
  }
  }
}
