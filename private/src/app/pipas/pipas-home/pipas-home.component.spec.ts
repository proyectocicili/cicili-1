import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PipasHomeComponent } from './pipas-home.component';

describe('PipasHomeComponent', () => {
  let component: PipasHomeComponent;
  let fixture: ComponentFixture<PipasHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PipasHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PipasHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
