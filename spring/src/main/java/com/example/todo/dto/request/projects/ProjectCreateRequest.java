package com.example.todo.dto.request.projects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import jakarta.validation.constraints.NotEmpty;

/**
 * @Getter  Lombookのアノテーション。クラス内の全てのフィールドに対して、getterメソッドを自動生成する
 * @RequiredArgsConstructor Lombokのアノテーション。フィールドを引数に持つコンストラクタを自動生成する。
 */
@Getter
@RequiredArgsConstructor
public class ProjectCreateRequest {


@NotEmpty
  private final String name;

  private final String summary;

}
