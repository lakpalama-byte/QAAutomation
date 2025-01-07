// src/app/student-form/student-form.component.ts
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../student.service';
import { Customer } from '../student';

@Component({
  selector: 'app-student-form',
  templateUrl: './student-form.component.html',
  styleUrls: ['./student-form.component.css']
})
export class CustomerFormComponent implements OnInit {
  student: Customer = { id: 0, name: '', email: '' };
  isEdit = false;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private customerService: CustomerService
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.isEdit = true;
      this.customerService.getCustomer(+id).subscribe(data => {
        this.student = data;
      });
    }
  }

  saveCustomer(): void {
    if (this.isEdit) {
      this.customerService.updateCustomer(this.student).subscribe(() => {
        this.router.navigate(['/customers']);
      });
    } else {
      this.customerService.createCustomer(this.student).subscribe(() => {
        this.router.navigate(['/customers']);
      });
    }
  }
}
