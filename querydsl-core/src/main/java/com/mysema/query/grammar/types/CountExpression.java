/*
 * Copyright (c) 2008 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.grammar.types;

import com.mysema.query.grammar.types.Expr.ENumber;

/**
 * CountExpression represents a count expression
 *
 * @author tiwe
 * @version $Id$
 *
 */
public class CountExpression extends ENumber<Long> {
    private final Expr<?> target;

    public CountExpression(Expr<?> expr) {
        super(Long.class);
        this.target = expr;
    }

    public Expr<?> getTarget() {
        return target;
    }
}