public class Q11 {

    interface readable {

        public void readBook();
        public void setBookMark();

    }

    abstract class Book implements readable {

        // Abstract class can implement an interface without implementing
        // all of its methods
        public void readBook() {

        }
    }

    public class EBook extends Book {

        // As readBook() has been implemented in its super class
        // Only need to implement setBookMark() here
        public void setBookMark() {

        }
    }
}
