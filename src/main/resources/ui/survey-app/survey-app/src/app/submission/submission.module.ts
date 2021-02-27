import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { SubmissionPageRoutingModule } from './submission-routing.module';

import { SubmissionPage } from './submission.page';
import {SurveyPageModule} from '../survey/survey.module';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    SubmissionPageRoutingModule,
    SurveyPageModule
  ],
  declarations: [SubmissionPage]
})
export class SubmissionPageModule {}
