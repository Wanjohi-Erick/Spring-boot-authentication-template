package com.walgotech.churchspringapp.models;

import org.springframework.data.annotation.Id;

public class Role {
    @Entity
    @Table(name = "roles")
    public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Enumerated(EnumType.STRING)
        @Column(length = 20)
        private ERole name;

        public Role() {

        }

        public Role(ERole name) {
            this.name = name;
        }
}
