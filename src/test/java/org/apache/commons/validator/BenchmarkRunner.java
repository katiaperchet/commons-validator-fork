package org.apache.commons.validator;
import  org.apache.commons.validator.routines.UrlValidator;

import org.openjdk.jmh.annotations.Benchmark;

import java.net.URI;
import java.net.URISyntaxException;

public class BenchmarkRunner {
    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    public void testIsValidAuth1Benchmark() throws URISyntaxException {
        // Your benchmarking logic here
        UrlValidator urlVal = new UrlValidator();
        URI uri= new URI("http://www.google.com");
        urlVal.isValidAuthority(uri.getRawAuthority());
    }
    @Benchmark
    public void testIsValid1Benchmark() throws URISyntaxException {
        // Your benchmarking logic here
        UrlValidator urlVal = new UrlValidator();
        urlVal.isValid("http://www.google.com");
    }

    @Benchmark
    public void testIsValidAuth2Benchmark() throws URISyntaxException {
        // Your benchmarking logic here
        UrlValidator urlVal = new UrlValidator();
        URI uri= new URI("http://l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.org");
        urlVal.isValidAuthority(uri.getRawAuthority());
    }
    @Benchmark
    public void testIsValid2Benchmark() throws URISyntaxException {
        // Your benchmarking logic here
        UrlValidator urlVal = new UrlValidator();
        urlVal.isValid("http://l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.org");
    }


}
