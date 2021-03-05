import {Component, Input, OnChanges, OnInit, SimpleChanges} from '@angular/core';
import {Question} from '../model/question';
import {BackendService} from '../backend.service';
import {Survey} from '../model/survey';

@Component({
  selector: 'app-submission',
  templateUrl: './submission.page.html',
  styleUrls: ['./submission.page.scss'],
})
export class SubmissionPage implements OnInit, OnChanges {

  constructor(private backendService: BackendService) {
  }

  @Input()
  type = 'quick';

  survey: Survey = {
    description: 'a brief description about the survey',
    name: 'Test Survey', id: 'test', questionSet: [{type: 'trueAndFalse', body: 'True or False?'},
      {type: 'text', body: 'Short answer?'},
      {type: 'testArea', body: 'Long answer?'},
      {type: 'multiChoice', body: 'Select One?'},
      {type: 'range', body: 'Select from Range?'}]
  };
  ngOnChanges(changes: SimpleChanges): void {
    this.backendService.getSurvey(this.type).subscribe(value => this.survey = value);
  }

  ngOnInit() {

  }

}
