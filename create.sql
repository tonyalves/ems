create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint UK_bvdrevla6o4w5s64n5qoaxsls unique (cpf)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
create sequence hibernate_sequence start 1 increment 1
create table account (id int8 generated by default as identity, balance float8 not null, number int4 not null, primary key (id))
create table employee (id int8 generated by default as identity, active boolean not null, cpf varchar(255) not null, job varchar(255) not null, name varchar(255) not null, salary float8 not null, account_id int8, enterprise_id int8, primary key (id))
create table enterprise (id int8 generated by default as identity, cnpj varchar(255) not null, name varchar(255) not null, account_id int8, primary key (id))
create table payroll_history (id int8 generated by default as identity, payment_date timestamp, payment_value float8, tax float8, employee_id int8, enterprise_id int8, primary key (id))
create table profile (id int8 generated by default as identity, name varchar(255), primary key (id))
create table users (id serial not null, email varchar(255), name varchar(255), password varchar(255), username varchar(255), primary key (id))
create table users_profiles (user_id serial not null, profiles_id int8 not null)
alter table if exists employee add constraint FKcfg6ajo8oske94exynxpf7tf9 foreign key (account_id) references account
alter table if exists employee add constraint FKjfh1aq5bxe2u1mty1t54tnywa foreign key (enterprise_id) references enterprise
alter table if exists enterprise add constraint FKae6q0tr2mr6wglrvmjco87kht foreign key (account_id) references account
alter table if exists payroll_history add constraint FKdr2xn6v8y3s9y6fxa1t2392m8 foreign key (employee_id) references employee
alter table if exists payroll_history add constraint FKthojdxgitn4ah88giie7f87ij foreign key (enterprise_id) references enterprise
alter table if exists users_profiles add constraint FKhpwjb3cislhdumt13joh9niq9 foreign key (profiles_id) references profile
alter table if exists users_profiles add constraint FKgmc2q50iqwetlbaqcchgvks8t foreign key (user_id) references users
