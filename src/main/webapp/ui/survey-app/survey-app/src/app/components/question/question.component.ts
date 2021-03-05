import {Component, Input, OnInit} from '@angular/core';
import {Question} from '../../model/question';
import {Survey} from '../../model/survey';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss'],
})
export class QuestionComponent implements OnInit {

  @Input()
  survey: Survey;
  answers = {};

  constructor() {
  }

  ngOnInit() {
  }

  handleText(question, event) {
    console.log(event.target.value);
  }


}
