import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PipasDetailComponent } from './pipas-detail.component';

describe('PipasDetailComponent', () => {
  let component: PipasDetailComponent;
  let fixture: ComponentFixture<PipasDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PipasDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PipasDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
