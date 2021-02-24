import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { SurveyPageRoutingModule } from './survey-routing.module';

import { SurveyPage } from './survey.page';
import {QuestionComponent} from '../components/question/question.component';

@NgModule({
    imports: [
        CommonModule,
        FormsModule,
        IonicModule,
        SurveyPageRoutingModule,
    ],
  declarations: [SurveyPage, QuestionComponent]
})
export class SurveyPageModule {}
