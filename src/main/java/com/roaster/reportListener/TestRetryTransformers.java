package com.roaster.reportListener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestRetryTransformers implements IAnnotationTransformer {

	public void transform(ITestAnnotation annot, Class test_cls, Constructor cons, Method test_method) {
		// TODO Auto-generated method stub
		annot.setRetryAnalyzer(com.roster.utilities.RetryAnalyzer.class);
		
	}

}
