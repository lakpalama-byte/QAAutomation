// src/app/customer-form/customer-form.component.ts
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.css']
})
export class CustomerFormComponent implements OnInit {
  customer: Customer = { id: 0, name: '', email: '' };
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
        this.customer = data;
      });
    }
  }

  saveCustomer(): void {
    if (this.isEdit) {
      this.customerService.updateCustomer(this.customer).subscribe(() => {
        this.router.navigate(['/customers']);
      });
    } else {
      this.customerService.createCustomer(this.customer).subscribe(() => {
        this.router.navigate(['/customers']);
      });
    }
  }
}
