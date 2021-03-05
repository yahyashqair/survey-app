class Answers {
  questionId: string;
  questionBody: string;
  values: string[];
}

export class Submission {
  surveyId;
  answerSet: Answers[];
}
