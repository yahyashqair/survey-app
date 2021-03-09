import {Component, Input, OnChanges, OnInit, SimpleChanges} from '@angular/core';
import {Question} from '../../model/question';
import {Survey} from '../../model/survey';
import {Submission} from '../../model/submission';
import {BackendService} from '../../backend.service';
import {ToastController} from '@ionic/angular';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.scss'],
})
export class QuestionComponent implements OnInit, OnChanges {


  @Input()
  survey: Survey;
  answers = {};
  submission: Submission = new Submission();

  ngOnChanges(changes: SimpleChanges): void {
    this.submission.surveyId = this.survey.id;
    this.submission.answerSet = [];
    this.survey.questionSet.forEach(value => {
      this.submission.answerSet.push({questionId: value.id, values: [], questionBody: value.body});
    });
  }

  constructor(private backendService: BackendService, public toastController: ToastController) {
  }

  ngOnInit() {
  }

  handleText(question: Question, event) {
    console.log(event.target.value);
    this.submission.answerSet.filter(value => value.questionBody === question.body).forEach(value => value.values = [event.target.value]);
  }


  submit() {
    if (this.isValidSubmission()) {
      this.backendService.submit(this.submission).subscribe(async value => {
        console.log('Done Thanks');
        const toast = await this.toastController.create({
          message: 'Your Submission have been saved.',
          duration: 2000
        });
        toast.present();
      });
    }
  }

  isValidSubmission() {
    return this.submission.answerSet.filter(value => value.values.length === 0).length <= 0;
  }
}
