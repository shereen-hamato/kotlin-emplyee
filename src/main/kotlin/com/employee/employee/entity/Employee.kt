package com.employee.employee.entity

import jakarta.persistence.*

@Entity
data class Employee(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    @Column(nullable = false)
    var name: String?,
    @Column(name="last_name",nullable = false)
    var surname: String?,
    @Column(unique = true, nullable = false)
    var email: String?,
    var department: String?,
    var jobTitle: String?,
) {
}