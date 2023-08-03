class Stack <T> {
    private a : T[];
    private index : number = -1;
    public constructor (a:T[]) {
        this.a = a;
    }

    private isFull() : boolean {
        return this.index == 9;
    }
    public push (element : T) : void {
        if (!this.isFull()) {
            this.a[++this.index] = element;
        }
        console.log("Stack is Overflow");
    }

    private isEmpty() : boolean {
        return this.index == -1;
    }

    public pop () : void {
        if (!this.isEmpty()) {
            console.log(this.a[this.index--]);
        } else {
            console.log("Stack Underflow");
        }
    }
}
