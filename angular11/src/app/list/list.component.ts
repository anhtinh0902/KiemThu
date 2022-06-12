import { Component, Input, OnInit, Output,EventEmitter  } from '@angular/core';
import { notes } from '../models/note.model';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  @Input('list') listNote:notes []=[];
  @Output() edit:EventEmitter<any> = new EventEmitter;
  constructor() { }

  ngOnInit(): void {
  }
  save(){
    localStorage.setItem('list_notes',JSON.stringify(this.listNote));
  }
  delete(i:number){
     this.listNote.splice(i,1);
     this.save();
  }
  openEdit(note:notes){
    this.edit.emit(note);
  }
}
