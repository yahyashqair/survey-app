import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Survey} from './model/survey';

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


}
