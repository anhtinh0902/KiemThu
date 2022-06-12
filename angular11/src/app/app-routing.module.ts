import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InformationComponent } from './information/information.component';
import { NotesComponent } from './notes/notes.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {
    path:"notes",
    component:NotesComponent
  },
  {
    path:"information",
    component:InformationComponent
  },
  {
    path:"user",
    component:UserComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
