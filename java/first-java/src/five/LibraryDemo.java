package five;

class InvalidMemberException extends Exception {
    public InvalidMemberException(String message) {
        super(message);
    }
}

class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks = 3;

    public void borrowBook(String memberName, int booksRequestedCount) throws Exception {
        if ( booksRequestedCount > availableBooks)
            throw new BookUnavailableException("Not enough books available");
        if (booksRequestedCount < 0)
            throw new Exception("You must request at least 1 book");
        if (memberName == null || memberName.isEmpty())
            throw new InvalidMemberException("Invalid Membership");
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.borrowBook("John", 1);
            library.borrowBook(null, 1);
        } catch (BookUnavailableException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Occured: " + e.getMessage());
            //System.out.println("Exception Occured");
        }
    }
}



/*
class Library {
    int availableBooks = 3;

    public void borrowBook(int booksRequestedCount) throws Exception {
        if ( booksRequestedCount > availableBooks)
            throw new ArrayIndexOutOfBoundsException("Not enough books available");
        if (booksRequestedCount < 0)
            throw new Exception("You must request at least 1 book");
    }
}

 */

//public void borrowBook(int booksRequestedCount) {
//    try {
//        if ( booksRequestedCount > availableBooks)
//            throw new Exception("Not enough books available");
//    } catch (ArrayIndexOutOfBoundsException e) {
//        System.out.println("Exception Occurred, you requested a book that does not exist!");
//    } catch (Exception e) {
//        System.out.println("Exception");
//    } finally {
//        System.out.println("FINALLY BLOCK");
//    }
//}





//    public void borrowBook(int booksRequested) {
//        try {
//            int[] books = {101, 102, 103};
//            System.out.println("Book Requested : " + books[booksRequested]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception Occurred, you requested a book that does not exist!");
//        } catch (Exception e) {
//            System.out.println("NullPointerException");
//        } finally {
//            System.out.println("FINALLY BLOCK");
//        }
//    }
