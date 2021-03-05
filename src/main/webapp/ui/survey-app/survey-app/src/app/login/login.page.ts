import {Component, OnInit} from '@angular/core';
import {BackendService} from '../backend.service';
import {ActivatedRoute, Router, RouterLink} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  email: string;
  organization: any;

  constructor(private backendService: BackendService, private router: Router) {
  }

  ngOnInit() {
  }

  submitForm() {
    if (this.validate(this.email, this.organization)) {
      this.backendService.login(this.email, this.organization).subscribe(value => {
        // tslint:disable-next-line:triple-equals
        if (value == true) {
          this.router.navigate(['survey']);
        } else {
          console.log('No permission to continue');
        }
      });
    }
  }

  private validate(email: string, organization: any) {
    return true;
  }

}
