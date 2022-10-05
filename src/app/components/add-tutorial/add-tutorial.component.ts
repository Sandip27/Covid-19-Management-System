import { Component } from '@angular/core';
import { Tutorial } from 'src/app/models/tutorial.model';
import { TutorialService } from 'src/app/services/tutorial.service';

@Component({
  selector: 'app-add-tutorial',
  templateUrl: './add-tutorial.component.html',
  styleUrls: ['./add-tutorial.component.css']
})
export class AddTutorialComponent {

  tutorial: Tutorial = {
    title: '',
    name: '',
  gender:'',
  manager:'',
  project:'',
  city:'',
  phoneno:'',
  published: false
  };
  submitted = false;

  constructor(private tutorialService: TutorialService) { }

  saveTutorial(): void {
    const data = {
      title: this.tutorial.title,
      name: this.tutorial.name,
      gender:this.tutorial.gender,
      manager:this.tutorial.manager,
      project:this.tutorial.project,
      city:this.tutorial.city,
      phoneno:this.tutorial.phoneno
    };

    this.tutorialService.create(data)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.submitted = true;
        },
        error: (e) => console.error(e)
      });
  }

  newTutorial(): void {
    this.submitted = false;
    this.tutorial = {
      title: '',
      name: '',
      gender:'',
       manager:'',
      project:'',
      city:'',
      phoneno:'',
      published: false
    };
  }

}