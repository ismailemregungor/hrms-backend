package ieg.hrms.core.utilities.results;

public class ErrorResult extends Result{

    public ErrorResult() {
        super(false);
    }

    public ErrorResult(final String message) {
        super(false, message);
    }

}
