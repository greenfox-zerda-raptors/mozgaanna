package com.greenfox.manna.domain;

import lombok.*;

/**
 * Created by mozgaanna on 10/01/17.
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {

    private int id;
    private String studentName;
    private String className;
    private String groupName;

}
