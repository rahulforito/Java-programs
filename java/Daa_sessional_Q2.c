 
#include <stdio.h>
#include <string.h>
int i,k,j,l,m,n, LCS_table[20][20];
void lcsAlgo(char* S1,char* S2) {
  m=strlen(S1);
  n=strlen(S2);
  // Filling 0's in the matrix
  for (i = 0; i <= m; i++)
    LCS_table[i][0] = 0;
  for (i = 0; i <= n; i++)
    LCS_table[0][i] = 0;
 
  // Building the mtrix in bottom-up way
  for (i = 1; i <= m; i++)
    for (j = 1; j <= n; j++) {
      if (S1[i - 1] == S2[j - 1]) {
        LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
      } else if (LCS_table[i - 1][j] >= LCS_table[i][j - 1]) {
        LCS_table[i][j] = LCS_table[i - 1][j];
      } else {
        LCS_table[i][j] = LCS_table[i][j - 1];
      }
    }
 
  int index = LCS_table[m][n];
  char lcsAlgo[index + 1];
  lcsAlgo[index] = '\0';
 
  int i = m, j = n;
  while (i > 0 && j > 0) {
    if (S1[i - 1] == S2[j - 1]) {
      lcsAlgo[index - 1] = S1[i - 1];
      i--;
      j--;
      index--;
    }
 
    else if (LCS_table[i - 1][j] > LCS_table[i][j - 1])
      i--;
    else
      j--;
  }
 
  // Printing the sub sequences
  printf("S1 : %s \nS2 : %s \n", S1, S2);
  printf("LCS: %s", lcsAlgo);
}
 
int main() {
//   printf("\nEnter the size of the string 01: ");
//   scanf("%d",&k);
//   char S1[k];
//   printf("Enter the size of the string 02: ");
//   scanf("%d",&l);
//   char S2[l];
//   printf("Enter the Value for String 01: ");
//   scanf("%s",&S1[k]);
//   printf("Enter the Value for String 02: ");
//   scanf("%s",&S2[l]);
//   char b[k][l];
  char S1[] = {'A','B','C','B','D','A','B'};

  char S2[] = "BDCABA";
  lcsAlgo(S1,S2);
  printf("\n");
}
