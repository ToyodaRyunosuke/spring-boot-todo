package com.example.todo.controller.api.projects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.todo.entity.Project;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/prijects")
public class ProjectCreateController {

  @PostMapping
  public ResponseEntity<Project> invoke(@Valid @RequestBody ProjectCreateRequest request){
    //TODO:Projectを左l区政するロジックを実行予定。
    Project project = new Project();

    return ResponseEntity.ok(project);
  }
}
