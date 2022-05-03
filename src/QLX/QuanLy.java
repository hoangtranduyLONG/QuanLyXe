package QLX;

import MiniTest.DanhBa;

public interface QuanLy <T>{
    void them(T t);
void sua(String name, T t);
void xoa(String name);
int timKiem(String name);
void sapXep();
void print();

    void add(DanhBa danhBa);

    void display();

    int search(String name);
}
