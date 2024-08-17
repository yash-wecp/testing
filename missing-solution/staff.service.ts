import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Task } from '../models/task.model';
import { environment } from '../../environments/environment';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root'
})
export class StaffService {
  private baseUrl = `${environment.apiUrl}/api/staff`;

  constructor(private http: HttpClient) { }

  getTasks(staffId: string): Observable<Task[]> {
    // get data for task
  }
  getStaff(): Observable<User[]>{
    // get data for users

  }
  updateTaskStatus(taskId: string, status: string): Observable<any> {
    // update task status
  }

}
