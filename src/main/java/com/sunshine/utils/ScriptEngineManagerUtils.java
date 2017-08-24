package com.sunshine.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.apache.log4j.Logger;

public class ScriptEngineManagerUtils {

    private static Logger logger = Logger.getLogger(ScriptEngineManagerUtils.class);
    private final static ScriptEngineManager manager = new ScriptEngineManager();
    private final static ScriptEngine engine = manager.getEngineByName("JavaScript");
    
    public static void main(String[] args) {
        try {
            String str = "77&&(1034||1038)";
            engine.eval(str).toString();
        }
        catch (ScriptException e) {
            logger.error(e);
        }
    }
    
    
}
