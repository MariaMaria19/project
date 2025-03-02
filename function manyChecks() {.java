function manyChecks() {
  let a = Math.floor(Math.random() * 20) + 1;
  console.log(`a = ${a}`);


  let resultTernary = (a > 10 ? 'a is bigger than 10' : 'a is less than or equal to 10 ' + (a === 5 ? 'an example of a special case' : '')) + (a === 15 ? 'but a is not 15' : '') + (a > 5 ? 'and a is greater than 5' : 'and a is less than or equal to 5 ') + (a % 2 ? ' and a is odd' : ' and a is even ');
  console.log("Результат тернарного оператора:", resultTernary);



  let resultIfElse = '';
  if (a > 10) {
    resultIfElse += 'a is bigger than 10';
  } else {
    resultIfElse += 'a is less than or equal to 10';
    if (a === 5) {
      resultIfElse += ' an example of a special case';
    }
  }
  if (a === 15) {
    resultIfElse += ' but a is not 15';
  }
  if (a > 5) {
    resultIfElse += ' and a is greater than 5';
  } else {
    resultIfElse += ' and a is less than or equal to 5';
  }
  if (a % 2) {
    resultIfElse += ' and a is odd';
  } else {
    resultIfElse += ' and a is even';
  }
  console.log("Результат if...else:", resultIfElse);


  let resultSwitch = '';
  switch (true) { 
    case (a > 10):
      resultSwitch += 'a is bigger than 10';
      break;
    case (a === 5):
      resultSwitch += 'a is less than or equal to 10 an example of a special case';
      break;
    case (a <=10):
      resultSwitch += 'a is less than or equal to 10';
      break;

  }
    if (a === 15) resultSwitch += ' but a is not 15';
    if (a > 5) resultSwitch += ' and a is greater than 5';
    else resultSwitch += ' and a is less than or equal to 5';
    if (a % 2) resultSwitch += ' and a is odd';
    else resultSwitch += ' and a is even';

  console.log("Результат switch (частично):", resultSwitch);
}

manyChecks();
