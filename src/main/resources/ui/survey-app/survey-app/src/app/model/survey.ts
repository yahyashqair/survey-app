import {Question} from './question';

export class Survey {
    id: string;
    name: string;
    description: string;
    questionSet: Question[];
}
