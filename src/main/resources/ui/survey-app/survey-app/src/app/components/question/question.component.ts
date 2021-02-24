import {Component, Input, OnInit} from '@angular/core';
import {Question} from '../../model/question';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss'],
})
export class QuestionComponent implements OnInit {

  questions: Question[] = [{type: 'trueAndFalse', body: 'True or False?'},
    {type: 'text', body: 'Short answer?'},
    {type: 'testArea', body: 'Long answer?'},
    {type: 'multiChoice', body: 'Select One?'},
    {type: 'range', body: 'Select from Range?'}];

  answers = {};

  constructor() {
  }

  ngOnInit() {
  }

  handleText(question, event) {
    console.log(event.target.value);
  }


}
