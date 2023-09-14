#include<stdio.h>
#include<string.h>
char stack[50];
int top = -1;
void push(char a){
    stack[++top] = a;
}
char pop(){
    return stack[top--];
}
int isoperand(char a){
    if((a>='a' && a<='z') || (a>='A' && a<='Z') || (a>='0' && a<='9') ) return 1;
    return 0;
}
int precedence(char a){
    if(a=='^') return 3;
    if(a=='*' || a== '/') return 2;
    if(a== '+' || a == '-') return 1;
    return -1;
}
char ans[50];
int j = -1;
void convert(char c[]){
    for(int i = 0;i<strlen(c);i++){
     if(isoperand(c[i])) ans[++j] = c[i];
     if(c[i] == '(') push(c[i]);
     if(c[i] == ')'){
        while(stack[top]!='(') ans[++j] = pop();
        pop();
    }
    else{
        while(precedence(c[i])<=precedence(stack[top])) ans[++j] = pop();
        push(c[i]);
    }
    }
    while(stack[top]!=-1) ans[++j] = pop();

}
int main(){
    char c[40];
    gets(c);
    convert(c);
    puts(ans);
}
