<?php

    function () {
        $source = array();

        foreach ($source as & $id => $element) {
            $source[$id] = $element + 1;
        }
    }

