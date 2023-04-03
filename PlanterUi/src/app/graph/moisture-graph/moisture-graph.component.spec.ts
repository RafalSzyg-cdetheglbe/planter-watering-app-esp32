import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MoistureGraphComponent } from './moisture-graph.component';

describe('MoistureGraphComponent', () => {
  let component: MoistureGraphComponent;
  let fixture: ComponentFixture<MoistureGraphComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MoistureGraphComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MoistureGraphComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
