/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Spells;

import RoundBasedCombat.Ability;
import RoundBasedCombat.AbilityType;
import RoundBasedCombat.AttackResult;
import RoundBasedCombat.Combat;
import RoundBasedCombat.SpellType;
import RoundBasedCombat.TargetType;
import RoundBasedCombat.Unit;


/**
 *
 * @author Domenik
 */
public class DominationOfLife extends Ability {

    public DominationOfLife() {
        super("Domination of Life", "Resurrects the target.", AbilityType.REZZ, TargetType.SINGLE, SpellType.DARK, 0, 50, 0);
    }

    @Override
    public void execute(Combat combat, Unit source, Unit target, AttackResult result) {
        
    }

    @Override
    public double calculateValue(Unit source) {
        return 10000 + source.getStats().getIntellect() * 1.3;
    }
    
}
