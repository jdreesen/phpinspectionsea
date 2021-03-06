package com.kalessil.phpStorm.phpInspectionsEA.api.strings;

import com.intellij.codeInsight.intention.IntentionAction;
import com.kalessil.phpStorm.phpInspectionsEA.PhpCodeInsightFixtureTestCase;
import com.kalessil.phpStorm.phpInspectionsEA.inspectors.apiUsage.strings.StringsFirstCharactersCompareInspector;

final public class StringsFirstCharactersCompareInspectorTest extends PhpCodeInsightFixtureTestCase {
    public void testIfFindsAllPatterns() {
        myFixture.enableInspections(new StringsFirstCharactersCompareInspector());

        myFixture.configureByFile("fixtures/api/strings/string-n-compare.php");
        myFixture.testHighlighting(true, false, true);

        for (final IntentionAction fix : myFixture.getAllQuickFixes()) {
            myFixture.launchAction(fix);
        }
        myFixture.setTestDataPath(".");
        myFixture.checkResultByFile("fixtures/api/strings/string-n-compare.fixed.php");
    }
}
