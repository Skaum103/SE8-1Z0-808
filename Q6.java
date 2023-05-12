public class Q6 {

    abstract class Planet {
        protected void revolve() {

        }

        // abstract methods can not have a body, {}
        abstract void rotate();
    }

    class Earth extends Planet {

        // Inherited methods must have equal more accessibility
        // private(default) < protected < public

        public void revolve() {

        }

        protected void rotate() {

        }
    }
}
