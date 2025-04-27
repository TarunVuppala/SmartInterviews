const book = {
    title: '',
    author: '',
    ISBN: '',
    isBorrowed: false,
    borrow() {
        if (this.isBorrowed) {
            return `${this.title} is already borrowed`;
        }
        this.isBorrowed = true;
    },
    return() {
        if (!this.isBorrowed) {
            return `${this.title} is not borrowed`;
        }
        this.isBorrowed = false;
    }
};

const library = {
    books: [],
    addBook(book) {
        this.books.push(book);
    },
    findBookByISBN(isbn) {
        return this.books.find(b => b.isbn === isbn) || null;
    },
    listAvailableBooks() {
        return this.books.filter(b => !b.isBorrowed);
    },
    listBorrowedBooks() {
        return this.books.filter(b => b.isBorrowed);
    }
}

const createBook = (title, author, ISBN) => {
    const book = Object.create(book);
    book.title = title;
    book.author = author;
    book.ISBN = ISBN;
    return book;
}

let bk1 = createBook('Book1', 'Author1', 'B1');
console.log(bk1);
let bk2 = createBook('Book2', 'Author2', 'C2');
console.log(bk2);

library.addBook(bk1);
library.addBook(bk2);
console.log(library.listAvailableBooks);

library.findBookByISBN('B1').borrow();
console.log(library.findBookByISBN('B1'));

console.log(library.listBorrowedBooks());
