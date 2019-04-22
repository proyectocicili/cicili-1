import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PipasHomeComponent} from './pipas-home/pipas-home.component'
import { PipasAddComponent } from './pipas-add/pipas-add.component';
import { from } from 'rxjs';
import { PipasEditComponent } from './pipas-edit/pipas-edit.component';
import { PipasDetailComponent } from './pipas-detail/pipas-detail.component';
const routes: Routes = [
  {
    path: '',
    component: PipasHomeComponent,
    pathMatch: 'full'
  },
  {
    path: 'pipas-add',
    component: PipasAddComponent,
  },
  {
    path: 'pipas-edit',
    component: PipasEditComponent,
  },
  {
    path: 'pipas-detail',
    component: PipasDetailComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PipasRoutingModule { }
