package polymorphism.oneLastExample;

abstract class Bear {
    protected abstract Integer chew();
    public Bear() {
        System.out.println(chew());
    }
}
// Does this compile?
