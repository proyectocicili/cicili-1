import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PipasRoutingModule } from './pipas-routing.module';
import { PipasHomeComponent } from './pipas-home/pipas-home.component';
import { PipasEditComponent } from './pipas-edit/pipas-edit.component';
import { PipasAddComponent } from './pipas-add/pipas-add.component';
import { PipasDetailComponent } from './pipas-detail/pipas-detail.component';

@NgModule({
  declarations: [PipasHomeComponent, PipasEditComponent, PipasAddComponent, PipasDetailComponent],
  imports: [
    CommonModule,
    PipasRoutingModule
  ]
})
export class PipasModule { }
