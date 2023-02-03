# Year-11-CS-Unit-6-Lab-RankingSystem

Your job is to create one class called User.
You should pass all of the tests in the UserTester class (provided).


A user starts at rank -8 and can progress all the way to 8.

There is no 0 (zero) rank. The next rank after -1 is 1.

Users will complete activities. These activities also have ranks.

Each time the user completes a ranked activity the users rank progress is updated based off of the activity's rank.

The progress earned from the completed activity is relative to what the user's current rank is compared to the rank of the activity.

A user's rank progress starts off at zero, each time the progress reaches 100 the user's rank is upgraded to the next level.

Any remaining progress earned while in the previous rank will be applied towards the next rank's progress (we don't throw any progress away). The exception is if there is no other rank left to progress towards (Once you reach rank 8 there is no more progression).

A user cannot progress beyond rank 8.

The only acceptable range of rank values is -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8. Any other value should raise an error.

The progress is scored like so:

Completing an activity that is ranked the same as that of the user's will be worth 3 points

Completing an activity that is ranked one ranking lower than the user's will be worth 1 point

Any activities completed that are ranking 2 levels or more lower than the user's ranking will be ignored
Completing an activity ranked higher than the current user's rank will accelerate the rank progression. The greater the difference between rankings the more the progression will be increased. The formula is 10 * d * d where d equals the difference in ranking between the activity and the user.

Logic Examples:

If a user ranked -8 completes an activity ranked -7 they will receive 10 progress
If a user ranked -8 completes an activity ranked -6 they will receive 40 progress
If a user ranked -8 completes an activity ranked -5 they will receive 90 progress
If a user ranked -8 completes an activity ranked -4 they will receive 160 progress, resulting in the user being upgraded to rank -7 and having earned 60 progress towards their next rank
If a user ranked -1 completes an activity ranked 1 they will receive 10 progress (remember, zero rank is ignored)

Code Usage Examples:

User user = new User();
user.getRank(); // => -8
user.getProgress(); // => 0
user.incProgress(-7);
user.getProgress(); // => 10
user.incProgress(-5); // will add 90 progress
user.getProgress(); // => 0 // progress is now zero
user.getRank(); // => -7 // rank was upgraded to -7
user.incProgress(0); // an IllegalArgumentException will be thrown. The message “The rank of an activity cannot be less than 8, 0, or greater than 8!” will be the message displayed as part of this thrown exception. 
Name : Vanessa Partner : Cherry
