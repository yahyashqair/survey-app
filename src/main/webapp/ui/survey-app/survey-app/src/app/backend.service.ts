import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Survey} from './model/survey';
import {Constant} from './utils/Constants';
import {Submission} from './model/submission';

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor(private httpClient: HttpClient) {
  }

  myFirstSubmission(email: string, surveyName: string): Observable<boolean> {
    return this.httpClient.get<boolean>(Constant.API_URL + email + '/' + surveyName);
  }


  getSurvey(surveyName: string): Observable<Survey> {
    return this.httpClient.get<Survey>(Constant.API_URL + 'survey/' + surveyName);
  }


  login(email: string, organization: any) {
    return this.httpClient.post(Constant.API_URL + 'users/', {email, organization});
  }

  submit(submission: Submission) {
    return this.httpClient.post(Constant.API_URL + 'survey/submit', submission);
  }
}
